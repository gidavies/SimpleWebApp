// Array of colours of the rainbow
var colours = ["red", "orange", "yellow", "green", "blue", "indigo", "violet"];

// Get a random colour from the colours array
var randomColour = colours[Math.floor(Math.random() * colours.length)];

// An array of greetings
var greetings = ["Hello", "Hi", "Hey", "Yo", "Sup", "Howdy", "Greetings", "Salutations", "Bonjour", "Hola", "Ciao", "G'day", "Aloha", "Shalom", "Namaste", "Salaam", "Sawubona", "Jambo", "Konnichiwa", "Ni hao", "Guten tag", "Privet", "Anyoung haseyo", "Merhaba", "Szia", "Marhaba", "Sveiki", "Hej", "Ahoj"];

// Get a random greeting from the greetings array
var randomGreeting = greetings[Math.floor(Math.random() * greetings.length)];

// Write the greeting and colour to the console
console.log(randomGreeting + " " + randomColour + " World!");
