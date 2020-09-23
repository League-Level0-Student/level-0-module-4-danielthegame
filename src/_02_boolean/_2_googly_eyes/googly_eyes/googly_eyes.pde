   PImage face;
void setup() {    
    size(500,500);
    face = loadImage("yellow.png");
    face.resize(width,height);
    background(face);
}                
                 
                          
void draw() {
  if(mousePressed){
    println(mouseX + " " + mouseY);
  }
  
  if(mouseX>376){
    mouseX=376;
}
    if(mouseX<285){
    mouseX=285;
  }
  
  if(mouseY<75){
  mouseY=75;
  }
  if(mouseY>136){
    mouseY=136;
  }
  fill(255,255,255);
  ellipse (216,125,150,110);
  fill(0,0,0);
  ellipse (mouseX-114,mouseY+23,20,20);
  
  fill(255,255,255);
  ellipse (330,102,150,110);
  fill(0,0,0);
  ellipse (mouseX,mouseY,20,20);
  

  

  

}
