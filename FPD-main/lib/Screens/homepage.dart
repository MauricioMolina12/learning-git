import 'package:flutter/material.dart';
import 'package:flutter_map/flutter_map.dart';
import 'package:latlong2/latlong.dart';
import 'package:geolocator/geolocator.dart';

const MAPBOX_ACCESS_TOKEN =
    "pk.eyJ1Ijoiam9qbWEiLCJhIjoiY2xuaHN3eWF1MTZ4MzJscmlwcGJtdGhoaSJ9.KI50YBpW_GOQZb9ZUlfTqQ";

var myPosition = LatLng(0, 0);

class homepage extends StatelessWidget {
  const homepage({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        debugShowCheckedModeBanner: false,
        title: "Homepage",
        theme: ThemeData(primarySwatch: Colors.blueGrey),
        home: homepageSF());
  }
}

class homepageSF extends StatefulWidget {
  const homepageSF({super.key});

  @override
  State<homepageSF> createState() => _homepageSFState();
}

class _homepageSFState extends State<homepageSF> {
  LatLng? myPosition;
  double lat = 0;
  double lon = 0;

  


  Future<Position> determinePosition() async {
    LocationPermission permission;
    permission = await Geolocator.checkPermission();
    if (permission == LocationPermission.denied) {
      permission = await Geolocator.requestPermission();
      if (permission == LocationPermission.denied) {
        return Future.error("error");
      }
    }
    return await Geolocator.getCurrentPosition();
  }

  void getCurrentLocation() async {
    Position position = await determinePosition();
    setState(() {
      myPosition = LatLng(position.latitude, position.longitude );
    });
  }
  @override
  void initState() {
    getCurrentLocation();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: const Text("Testmapa"),
          centerTitle: true,
        ),
        body: Center(
          child: Stack(
            children: [
              myPosition == null? CircularProgressIndicator() : FlutterMap(
                  options: MapOptions(
                      center: myPosition, maxZoom: 100, zoom: 18),
                  nonRotatedChildren: [
                    TileLayer(
                      urlTemplate:
                      'https://api.mapbox.com/styles/v1/{id}/tiles/{z}/{x}/{y}?access_token={accessToken}',
                      additionalOptions: const {
                        'accessToken': MAPBOX_ACCESS_TOKEN,
                        'id': 'mapbox/streets-v12'
                      },
                    ),
                    MarkerLayer(
                      markers: [
                        Marker(
                            point: myPosition!,
                            builder: (context) {
                              return Container(
                                child: Image.asset(
                                  "assets/logoapp.png",
                                ),
                              );
                            })
                      ],
                    )
                  ]),
            ]
          ),
        ));
  }
}
