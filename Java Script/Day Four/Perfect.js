function Perfect() {

const list = [4, 9, 25, 49, 12, 16];
let isSquare = false;



for (let count = 0; count< list.length; count++) {
let number = list[count];

let i = 1;

while(i * i <= number){

if(i * i === number){
	isSquare = true;
}
else {
     isSquare = false;

i++;

}
console.log(number + " - " + isSquare);

}
}
}