// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['A link is only as long as your longest strong chain', 'Search Warranty', 
      'Split it 50/50/50', 'Keep your friends close, but your enemies toaster'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}
  //Uses fetch to get content from servlet and puts it in hello container
async function getHello() {
  const response = await fetch('/data');
  const quote = await response.json();
  document.getElementById('comment-containerOne').innerText = quote.commentOne;
  document.getElementById('comment-containerTwo').innerText = quote.commentTwo;
  document.getElementById('comment-containerThree').innerText = quote.commentThree;
}
