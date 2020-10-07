
/***********  SOUND ***************
 	 * Some computers are unable to play sounds. 
 	 * If you cannot play sound on this computer, set canPlaySounds to false.
 	 * If you are not sure, ask your teacher 
 	 * *****************/
boolean canPlaySounds = false;

void setup() {

  //Find a Where's Waldo picture and drop it into this sketch.     
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(600, 400); 
  // Resize your waldo picture to the same size as the sketch
  waldo.resize(600, 400);
  // Make the waldo image your sketch background
  background(waldo);
}

void draw() {

  //Used to show target hotspot
  //rect(368, 200, 55, 83);
  //fill(255,0,0);

  // If the user presses the mouse .......
  if (mousePressed) {

    // x 269 y 9 top x 286 y 392 bottom x 0 y 222 left x 591 y 195
    if (mouseX > 368 && mouseX < 423 && mouseY > 200 && mouseY < 283)
    {
      
      /*
      && is a boolean AND in programming speak
      if condition 1 AND condition 2 then.. 
      */

      
      // Use this print statement to help you find the location of Waldo to use in the code below
      // println("X: " + mouseX + " Y: " + mouseY); 
      println("X: " + mouseX + " Y: " + mouseY); 

      // Check if the location of the mouse is anywhere on the image of Waldo.
      // If it is, print “Waldo found!”  Use the text() command to write it on the sketch.

      /*
     * We need to determine the x and y of where waldo is.
       * then we need to determine the width and height.
       
       *  0,0
       
       368 will resolve true for any point to the right of 368
       *
       |
       |
       |
       |____* 423 ______* 500
       
       
       Top lelft
       X: 368
       Y: 200
       
       w: 423 - 368 = 55
       h: 83
       
       bottom right
       X: 423
       Y: 283
       
       Determine if mouse click falls within our spacial coordinates
       */



      
      text("WALDO FOUND!!", 348, 195);
      fill(255, 0, 0);  
      text("WALDO FOUND!!", 349, 196);
      fill(255, 255, 255);
      

      if (canPlaySounds) {
        // Use the playWhoohoo() method below. You can change the sound if you want
      } 

      // However, if the mouse is not on Waldo, print "Not here!" 
      // Use the text() command to write it on the sketch. 

      if (canPlaySounds) {
        // Use the playDoh() method below. You can change the sound if you want
      }
    }
  }
}

/*********************  This code is needed to play sounds. ********************
 Remove the comment markers below, but DON'T CHANGE THE CODE */


/*
import ddf.minim.*;
 Minim minim = new Minim(this); 
 
 AudioSample woohoo;
 void playWoohoo() {
 if (woohoo == null) 
 woohoo = minim.loadSample("homer-woohoo.wav");
 woohoo.stop();
 woohoo.trigger();
 }
 
 AudioSample doh;
 void playDoh() {
 if (doh == null)
 doh = minim.loadSample("homer-doh.wav"); 
 doh.stop();
 doh.trigger();
 }
 */
