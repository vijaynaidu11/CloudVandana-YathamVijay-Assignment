//I am writing my JS code to work in node.js
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Please enter a sentence: ", function(inputSentence) {
    const reversedSentence = reverseWordsInSentence(inputSentence);
    console.log("Reversed Sentence: " + reversedSentence);
    rl.close();
});

function reverseWordsInSentence(sentence) {
    var words = [];
    var word = '';
    var reversedSentence = '';

    for (var i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ' || i === sentence.length - 1) {
            if (i === sentence.length - 1) {
                word += sentence[i];
            }
            for (var j = word.length - 1; j >= 0; j--) {
                reversedSentence += word[j];
            }
            if (i !== sentence.length - 1) {
                reversedSentence += ' ';
            }
            word = '';
        } else {
            word += sentence[i];
        }
    }

    return reversedSentence;
}

