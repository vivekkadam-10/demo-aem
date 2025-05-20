/*  AEM CODE ASSIST V18: AI Generated Code Start - */
// JavaScript for Features Component
// Handles lazy loading of images and ARIA attributes for accessibility

document.addEventListener('DOMContentLoaded', function() {
  console.log('Features Component JS Loaded');

  // Lazy load images
  const lazyImages = document.querySelectorAll('.features-component__tile img');
  lazyImages.forEach(function(img) {
    img.setAttribute('loading', 'lazy');
  });

  // Set ARIA attributes for accessibility
  const tiles = document.querySelectorAll('.features-component__tile');
  tiles.forEach(function(tile) {
    tile.setAttribute('role', 'region');
    tile.setAttribute('aria-label', 'Feature Tile');
  });
});

/* Token Usage: {'total_tokens': 9293, 'completion_tokens': 250, 'prompt_tokens': 8187} */
/* Timestamp: 2025-04-14T13:56:30 */
/* Model Used: gpt-4o-2 */

/*  AEM CODE ASSIST V18: AI Generated Code End - */
