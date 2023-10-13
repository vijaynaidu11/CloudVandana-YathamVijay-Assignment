const readline = require('readline');

const read = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

read.question("Enter numbers separated by spaces: ", function(input) {
    
    const arr = input.split(' ').map(Number);

   
    arr.sort(function(a, b) {
        return b - a;
    });

    console.log("Sorted in descending order: " + arr.join(' '));

    read.close();
});
