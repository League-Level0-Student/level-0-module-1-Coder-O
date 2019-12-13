float x = 400; 
float y = 600; 
float z = -5.1;
float w = 1;
void setup() {

    background(0, 0, 40); size(800, 800);

}

void draw() {
    background(0, 0, 40); size(800, 800);
    w++;
    if (z<=0) {
     z=z+.05; 
   }
    else {
    z=z*1.5;
    }
    y = y-(5+z);
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    
}
