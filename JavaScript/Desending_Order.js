function Desending_method1(array) {
    let Result = []
    let len = array.length;

    for (let i = 0; i < len; i++) {
        let max = array[0];
        let index = 0;
        for (let j = 1; j < len; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j;
            }
        }
        Result[i] = max;
        array.splice(index, 1);
    }
    console.log(Result)
}

function Method_2(array) {
    const Result = array.sort((a, b) => b - a);
    console.log(Result);
}


Desending_method1([12, 13, 15, 10, 11, 14]);

Method_2([12, 13, 15, 10, 11, 14]);