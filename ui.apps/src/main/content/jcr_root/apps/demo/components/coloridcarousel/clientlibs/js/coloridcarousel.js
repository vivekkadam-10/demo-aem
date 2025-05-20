/*  AEM CODE ASSIST V18: AI Generated Code Start - */
// JavaScript for handling the ColorID Carousel navigation

document.addEventListener('DOMContentLoaded', function() {
  const carousel = document.querySelector('.colorid-carousel');
  const slides = carousel.querySelectorAll('.slide');
  const prevArrow = carousel.querySelector('.arrow-prev');
  const nextArrow = carousel.querySelector('.arrow-next');
  let currentIndex = 0;

  function updateCarousel() {
    slides.forEach((slide, index) => {
      slide.style.transform = `translateX(${(index - currentIndex) * 100}%)`;
    });
    prevArrow.style.display = currentIndex === 0 ? 'none' : 'block';
    nextArrow.style.display = currentIndex === slides.length - 1 ? 'none' : 'block';
  }

  prevArrow.addEventListener('click', function() {
    if (currentIndex > 0) {
      currentIndex--;
      updateCarousel();
    }
  });

  nextArrow.addEventListener('click', function() {
    if (currentIndex < slides.length - 1) {
      currentIndex++;
      updateCarousel();
    }
  });

  updateCarousel();
});

/* Token Usage: {'total_tokens': 10631, 'completion_tokens': 380, 'prompt_tokens': 9200} */
/* Timestamp: 2025-04-14T10:14:02 */
/* Model Used: gpt-4o-2 */

/*  AEM CODE ASSIST V18: AI Generated Code End - */
