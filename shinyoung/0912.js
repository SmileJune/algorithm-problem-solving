function solution(number) {
  let array = [[0, 0]];
  let answer = 0;
  number.map((x) => {
    let copiedArray = [];
    while (array.length > 0) {
      const [poppedNumber, count] = array.shift();
      copiedArray.push([poppedNumber, count]);
      if ((count === 2) & (poppedNumber + x === 0)) {
        answer += 1;
      } else {
        if (count < 2) {
          copiedArray.push([poppedNumber + x, count + 1]);
        }
      }
    }

    array = [...copiedArray];
  });

  return answer;
}
