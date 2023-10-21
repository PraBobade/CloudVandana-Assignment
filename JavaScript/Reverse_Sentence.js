function Reverse(sentence) {
    let Result = '';
    let words = sentence.split(' ');

    words.forEach(element => {
        for (let i = element.length; i > 0; i--) {
            Result += element[i - 1];
        }
        Result += ' ';
    });
    console.log(Result);
}

Reverse("This is a sunny day");