/*  AEM CODE ASSIST V18: AI Generated Code Start - */
// JavaScript for CTA Banner Component
// Handles click events for CTAs

document.addEventListener('DOMContentLoaded', function() {
  console.log('CTA Banner Component JS Loaded');

  const ctaButtons = document.querySelectorAll('.cta-banner-component .cta-buttons a');
  ctaButtons.forEach(function(button) {
    button.addEventListener('click', function(event) {
      const openInNewWindow = button.dataset.openInNewWindow === 'true';
      if (openInNewWindow) {
        event.preventDefault();
        window.open(button.href, '_blank');
      }
    });
  });
});

/* Token Usage: {'total_tokens': 11565, 'completion_tokens': 211, 'prompt_tokens': 10397} */
/* Timestamp: 2025-04-14T12:36:24 */
/* Model Used: gpt-4o-2 */

/*  AEM CODE ASSIST V18: AI Generated Code End - */
