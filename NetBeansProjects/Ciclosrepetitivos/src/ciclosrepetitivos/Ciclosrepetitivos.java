package ciclosrepetitivos;

import java.util.*;

public class Ciclosrepetitivos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Programa que dice si eres un verdadero fan del futbol");

        int opc;
        System.out.println("");
        System.out.println("Pregunta 1");
        System.out.println("¿Qué club tiene más títulos de la Champions League? ¿Y con cuantos?");

        System.out.println("1.Milán");
        System.out.println("2.Real Madrid");
        System.out.println("3.Chelsea");
        System.out.println("4.Liverpool");
        int champ = leer.nextInt();
        if (champ == 2) {
            System.out.println("Efectivamente, es el Real Madrid, ahora dime con cuantos");
            
            System.out.println("Digite titulos:");
            int t= leer.nextInt();
            if (t != 14) {
                System.out.println("Errado, tiene 14");
            }else {
                System.out.println("Si, son 14 que tiene ");
            }
        } else if (champ == 1) {
            System.out.println("No, el Milán nada más tiene 7 titulos, era Real Madrid con 14 titulos");
        } else if (champ == 3) {
            System.out.println("No, el Chelsea nada más tiene 2 titulos, era Real Madrid con 14 titulos");
        } else if (champ == 4) {
            System.out.println("No, el Liverpool nada más tiene 6 titulos, era Real Madrid con 14 titulos");
        }
        System.out.println("");
        System.out.println("Pregunta 2");
        System.out.println("¿Quién es el único jugador en ganar la Champions League con tres equipos distintos? ¿Y cuales son esos equipos?");

        System.out.println("1.Cristiano Ronaldo");
        System.out.println("2.Andrea Pirlo");
        System.out.println("3.Clarence Seedorf");
        System.out.println("4.David Beckham");
        int jchamp = leer.nextInt();

        if (jchamp == 3) {
            System.out.println("Efectivamente, es Clarence Seedorf");
            
            System.out.println("Ahora dime esos 3 equipos");
            
            System.out.println("1.Ajax,Real Madrid y Milán");
            System.out.println("2.Barcelona, Juventus y Napoli");
            System.out.println("3.Chelsea, Milán y Liverpool");
            int e= leer.nextInt();
            if (e != 1) {
                System.out.println("Estás errado");
            }else{
                System.out.println("Si, efectivamente es Ajax, Real Madrid y Milán");
            }
               
        } else if (jchamp == 1) {
            System.out.println("RESPUESTA INCORRECTA, CR7 tiene 5 titulos, pero los 5 titulos los ganó entre dos equipos (M.United and Real Madrid)");

        } else if (jchamp == 2) {
            System.out.println("RESPUESTA INCORRECTA, Andrea Pirlo tiene 2 titulos y los dos los ganó en AC milán");

        }else if (jchamp == 4){
            System.out.println("RESPUESTA INCORRECTA, David Beckham tiene 1 solo titulo y lo ganó con el M.United");
        }
        
        System.out.println("");
        System.out.println("Pregunta 3");
        System.out.println("Tres personas han ganado la Champions League tres veces como técnico. ¿Quiénes son?");
        
        System.out.println("1.Pochettino, Simeone y Xavi");
        System.out.println("2.Bob Paisley, Carlo Ancelotti y Zinedine Zidane");
        System.out.println("3.George Weah, Ryan Giggs y Romario");
        int tec = leer.nextInt();
        
        if (tec == 2) {
            System.out.println("Correcto");
        } else if (tec == 1){
            System.out.println("No");
        } else if (tec == 3){
            System.out.println("No");
        }
        
        
        
        System.out.println("");
        System.out.println("Pregunta 4");
        System.out.println("¿En qué temporada la Copa de Europa comenzó a denominarse Champions League?");
        
        System.out.println("1.1992-93");
        System.out.println("2.1970-71");
        System.out.println("3.1975-76");
        System.out.println("4.1980-81");
        int año = leer.nextInt();
        
        if (año == 1) {
            System.out.println("Correcto, desde ese año al trofeo copa de europa se le denominó UEFA CHAMPIONS LEAGUE");
            
        } else if (año == 2){
            System.out.println("No");
            
        }else if (año==3){
            System.out.println("No");
            
        } else if (año == 4){
            System.out.println("No");
        }
        
  
        System.out.println("");
        System.out.println("Pregunta 5");
        System.out.println("¿Cuál fue el primer equipo británico en ganar la Copa de Europa?");
        
        System.out.println("1.Chelsea");
        System.out.println("2.Liverpool");
        System.out.println("3.M.City");
        System.out.println("4.Celtic");
        int b = leer.nextInt();
        
        
        
        System.out.println("");
        System.out.println("Pregunta 6");
        System.out.println("Sólo un club de Rumanía ganó la Copa de Europa. ¿Cuál?");
        
        
        
        
        System.out.println("");
        System.out.println("Pregunta 7");
        System.out.println("Liverpool ganó la Champions League en seis ocasiones y el Manchester United, en tres. ¿Qué otro equipo inglés tiene dos títulos?");
        
        
        
        System.out.println("");
        System.out.println("Pregunta 8");
        System.out.println("¿Quién es el máximo goleador de la historia de la Champions League?");
        
        
        
        System.out.println("");
        System.out.println("Pregunta 9");
        System.out.println("¿Quién es el jugador con más partidos disputados en la Champions League?");
        
        
        System.out.println("");
        System.out.println("Pregunta 10");
        System.out.println("¿Quién es el jugador con más títulos ganados en la Champions League?");
        
        
    }
}
