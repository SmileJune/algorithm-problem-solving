// 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/161990

function solution(wallpaper) {
  let startX = wallpaper.length - 1;
  let startY = wallpaper[0].length - 1;
  let endX = 0;
  let endY = 0;
  for (let i = 0; i < wallpaper.length; i++) {
    for (let j = 0; j < wallpaper[0].length; j++) {
      if (wallpaper[i][j] === "#") {
        startX = startX > i ? i : startX;
        startY = startY > j ? j : startY;
        endX = endX < i ? i : endX;
        endY = endY < j ? j : endY;
      }
    }
  }

  return [startX, startY, endX + 1, endY + 1];
}
