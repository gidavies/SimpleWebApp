// Array of colours of the rainbow
var colours = ["red", "orange", "yellow", "green", "blue", "indigo", "violet"];

// Get a random colour from the colours array
var randomColour = colours[Math.floor(Math.random() * colours.length)];

// An array of greetings
var greetings = ["Hello", "Hi", "Hey", "Yo", "Sup", "Howdy", "Greetings", "Salutations", "Bonjour", "Hola", "Ciao", "G'day", "Aloha", "Shalom", "Namaste", "Salaam", "Sawubona", "Jambo", "Konnichiwa", "Ni hao", "Guten tag", "Privet", "Anyoung haseyo", "Merhaba", "Szia", "Marhaba", "Sveiki", "Hej", "Ahoj"    
];

// få en slumpmässig medlem av hälsningsarrayen
var randomGreeting = greetings[Math.floor(Math.random() * greetings.length)];

// Write the greeting and colour to the console
console.log(randomGreeting + ", " + randomColour + " World!");

function areaOfHexagon(side) {
    return 3 * Math.sqrt(3) * side * side / 2;
}

function calculateDaysBetweenDates() {
    var date1 = new Date(document.getElementById('date1').value);
    var date2 = new Date(document.getElementById('date2').value);

    var timeDiff = Math.abs(date2.getTime() - date1.getTime());
    var diffDays = Math.ceil(timeDiff / (1000 * 3600 * 24));

    document.getElementById('result').innerHTML = diffDays;
}