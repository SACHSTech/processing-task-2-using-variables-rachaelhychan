import processing.core.PApplet;

public class Sketch extends PApplet {
	
  // This Program Uses Sketch to Draw a House and Works With any Sized Window
  // Author: Rachael Chan
  
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    // Blue Sky
    background(129, 208, 240);
  }

  
  public void draw() {
	
    // Green Grass
    fill(115, 181, 71);
    rect((float) 0, (float) height / 400 * 210, (float) width / 1, (float) height / 400 * 190);

    // Red Triangle Roof
    fill(184, 59, 48);
    triangle((float) width / 400 * 129, (float) height / 400 * 107, (float) width / 400 * 65, (float) height / 400 * 187, (float) width / 400 * 173, (float) height / 400 * 187);
    
    // Red Side Roof
    fill(122, 38, 31);
    quad((float) width / 400 * 129, (float) height / 400 * 107, (float) width / 400 * 173, (float) height / 400 * 187, (float) width / 400 * 306, (float) height / 400 * 172, (float) width / 400 * 265, (float) height / 400 * 98);
    
    // Yellow Right Wall
    fill(189, 147, 58);
    quad((float) width / 400 * 173, (float) height / 400 * 187, (float) width / 400 * 173, (float) height / 400 * 285, (float) width / 400 * 306, (float) height / 400 * 260, (float) width / 400 * 306, (float) height / 400 * 172);
    
    // Yellow Left Wall
    fill(255, 208, 99);
    rect((float) width / 400 * 65, (float) height / 400 * 187, (float) width / 400 * 108, (float) height / 400 * 98);
    
    // Brown Door
    fill(89, 37, 12);
    rect((float) width / 400 * 100, (float) height / 400 * 230, (float) width / 400 * 30, (float) height / 400 * 55);

    // Black Door Knob
    fill(0, 0, 0);
    ellipse((float) width / 400 * 108, (float) height / 400 * 260, (float) width / 400 * 3, (float) height / 400 * 3);
    
    // Purple Left Window Frame
    fill(147, 70, 199);
    ellipse((float) width / 400 * 219, (float) height / 400 * 228, (float) width / 400 * 35, (float) height / 400 * 35);

    // Light Blue Left Window
    fill(162, 245, 245);
    ellipse((float) width / 400 * 219, (float) height / 400 * 228, (float) width / 400 * 28, (float) height / 400 * 28);
    
    // Purple Right Window Frame
    fill(147, 70, 199);
    ellipse((float) width / 400 * 269, (float) height / 400 * 220, (float) width / 400 * 35, (float) height / 400 * 35);

    // Light Blue Right Window
    fill(162, 245, 245);
    ellipse((float) width / 400 * 269,  (float) height / 400 * 220, (float) width / 400 *28, (float) height / 400 *28);

    // Brown Chimney
    fill(61, 34, 11);
    rect((float) width / 400 * 264, (float) height / 400 * 126, (float) width / 400 * 10, (float) height / 400 * 15);

    // Yellow Sun
    fill(245, 204, 71);
    ellipse((float) width / 400 * 80,  (float) height / 400 * 70, (float) width / 400 * 45, (float) height / 400 *45);


  }

}