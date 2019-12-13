int m = 100;
int em = Math.abs(mouseX-93);
int eme = Math.abs(mouseY-130);
void setup() {
  PImage face = loadImage("face.jpeg");
  image(face, 0, 0);
  size(189, 268);
}

void draw() {
   m = -1*m;
  ellipse(93.99999, 130, 13, 35);
  em = Math.abs(mouseX-93)+46;
  eme = Math.abs(mouseY-130)+65;
/*  if (mouseX>93){
     em = mouseX;
  }
  else {
     em = 0;
  }
  if (mouseY>130){
     eme = mouseY;
  }
  else {
     eme = Math.abs(mouseY-93);
  }*/
  fill(em, m, eme+10);
  
}
