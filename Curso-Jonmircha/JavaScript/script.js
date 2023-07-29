const imageContainer = document.querySelector(".image-container");
const images = document.querySelectorAll(".image-container img");
const leftArrow = document.querySelector(".left-arrow");
const rightArrow = document.querySelector(".right-arrow");

let currentIndex = 0;

leftArrow.addEventListener("click", () => {
  currentIndex = (currentIndex - 1 + images.length) % images.length;
  updateGallery();
});

rightArrow.addEventListener("click", () => {
  currentIndex = (currentIndex + 1) % images.length;
  updateGallery();
});

function updateGallery() {
  const translateValue = -currentIndex * (images[0].width + 10);
  imageContainer.style.transform = `translateX(${translateValue}px)`;

  images.forEach((img, index) => {
    if (index === currentIndex) {
      img.style.transform = "scale(1.2)";
    } else {
      img.style.transform = "scale(1)";
    }
  });
}
