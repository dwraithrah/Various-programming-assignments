//Scarecrow.js
function main(){
	//retrieve <canvas> element
	var canvas = document.getElementById('webgl');
	
	//get the rendering context for WebGL
	//var gl = getWebGLContext(canvas);
	//error message in case it cannot be rendered
	if (!canvas){
		console.log('Failed to get the rendering context for WebGL');
		return;
	}
	
	//get rendering context for 2DCG
	var ctx = canvas.getContext('2d');//fillstyle for ground


	//specify the color for clearing the canvas
	//gl.clearColor(0.0, .6, 1.0, 1.0);
	
	//drawing sky, light blue rectangle
	ctx.fillStyle = 'rgba(0, 120, 255, 1.0)';//set a light blue color
	ctx.fillRect(0, 0, 800, 800);//fill rectangle
	
	//drawing the ground, a light brown rectangle
	ctx.fillStyle = 'rgba(181,120, 29, 1.0)'; //set a light brown color
	ctx.fillRect(0, 650, 800, 150);  //fill rectangle with the color
	
	//Drawing the left foot
	ctx.fillStyle = 'rgba(101, 67, 33, 1.0)';//set a dark brown color
	ctx.fillRect(300, 630, 15, 20);  //fill left foot.
	
	//drawing toes on left foot
	ctx.fillStyle = 'rgba(101, 67, 33, 1.0)';//set a dark brown color
	ctx.fillRect(290, 640, 10, 10);  //fill toes left foot.
	
	//drawing the right foot.
	ctx.fillStyle = 'rgba(101, 67, 33, 1.0)';//set a dark brown color
	ctx.fillRect(365, 630, 15, 20);  //fill left foot.
	
	//drawing the right toes
	ctx.fillStyle = 'rgba(101, 67, 33, 1.0)';//set a dark brown color
	ctx.fillRect(380, 640, 10, 10);  //fill left foot.
	
	//the top floppy part of the boots
	ctx.fillStyle = 'rgba(101, 67, 33, 1.0)';//set a dark brown color
	ctx.fillRect(290, 625, 40, 5);  //fill floppy part of boots
	
	//drawing left leg. This will be a series of shortening boxes.
	 //this next box is the short strip of pants before flaring out at the calfs
	ctx.fillStyle = 'rgba(101, 120, 33, 1.0)';//set a green/grey color
	ctx.fillRect(300, 620, 15, 5);  //fill ankle paortion before flaring out.
	
	 //this next line starts flaring out to the calfs left leg
	 ctx.fillStyle = 'rgba(101, 120, 33, 1.0)';//set a green/grey color
	 ctx.fillRect(300, 617, 16, 3);  //flaring out to calf
	 ctx.fillRect(300, 614, 17, 3);  //flaring out to calf
	 ctx.fillRect(299, 611, 19, 3);  //flaring out to calf
	 ctx.fillRect(298, 608, 21, 3);  //flaring out to calf
	 ctx.fillRect(297, 605, 22, 3);  //flaring out to calf
	 ctx.fillRect(296, 602, 22, 3);  //flaring out to calf
	 ctx.fillRect(295, 599, 23, 3);  //flaring out to calf
	 ctx.fillRect(295, 596, 23, 3);  //flaring out to calf
	 ctx.fillRect(295, 593, 22, 3);  //flaring out to calf
	 ctx.fillRect(296, 590, 20, 3);  //flaring out to calf
	 ctx.fillRect(297, 587, 19, 3);  //flaring out to calf
	 ctx.fillRect(298, 584, 17, 3);  //flaring out to calf
	 ctx.fillRect(299, 581, 16, 3);  //flaring out to calf
	 
	 //this next part forms the knees left leg
	 ctx.fillRect(300, 569, 15, 12);  //flaring out to calf
	 
	 //starts to angle and widen to form the thighs left leg
	 ctx.fillRect(301, 563, 15, 6);  //flaring out to calf
	 ctx.fillRect(300, 557, 17, 6);  //flaring out to calf
	 ctx.fillRect(299, 551, 19, 6);  //flaring out to calf
	 ctx.fillRect(298, 545, 22, 6);  //flaring out to calf
	 ctx.fillRect(297, 539, 25, 6);  //flaring out to calf
	 ctx.fillRect(296, 533, 28, 6);  //flaring out to calf
	 ctx.fillRect(297, 527, 27, 6);  //flaring out to calf
	 ctx.fillRect(298, 521, 27, 6);  //flaring out to calf
	 ctx.fillRect(299, 515, 27, 6);  //flaring out to calf
	 ctx.fillRect(300, 509, 27, 6);  //flaring out to calf
	 ctx.fillRect(300, 507, 27, 2);  //flaring out to calf
	
	 
	 //right boot, floppy tongue
	 ctx.fillStyle = 'rgba(101, 67, 33, 1.0)';//set a dark brown color
	 ctx.fillRect(350, 625, 40, 5);  //fill floppy part of boots
	 
	 //drawing right leg. This will be a series of shortening boxes.
	 //this next box is the short strip of pants before flaring out at the calfs
	ctx.fillStyle = 'rgba(101, 120, 33, 1.0)';//set a green/grey color
	ctx.fillRect(365, 620, 15, 5);  //fill ankle paortion before flaring out.
	
	 //this next line starts flaring out to the calfs right leg
	 ctx.fillRect(364, 617, 16, 3);  //flaring out to calf
	 ctx.fillRect(363, 614, 17, 3);  //flaring out to calf
	 ctx.fillRect(362, 611, 19, 3);  //flaring out to calf
	 ctx.fillRect(361, 608, 21, 3);  //flaring out to calf
	 ctx.fillRect(361, 605, 22, 3);  //flaring out to calf
	 ctx.fillRect(361, 602, 22, 3);  //flaring out to calf
	 ctx.fillRect(361, 599, 23, 3);  //flaring out to calf
	 ctx.fillRect(362, 596, 23, 3);  //flaring out to calf
	 ctx.fillRect(363, 593, 22, 3);  //flaring out to calf
	 ctx.fillRect(364, 590, 20, 3);  //flaring out to calf
	 ctx.fillRect(365, 587, 19, 3);  //flaring out to calf
	 ctx.fillRect(365, 584, 17, 3);  //flaring out to calf
	 ctx.fillRect(365, 581, 16, 3);  //flaring out to calf
	 
	  //this next part forms the knees
	 ctx.fillRect(365, 569, 15, 12);  //flaring out to calf
	 
	  //starts to angle and widen to form the thighs right leg
	 ctx.fillRect(364, 563, 15, 6);  //flaring out to calf
	 ctx.fillRect(363, 557, 17, 6);  //flaring out to calf
	 ctx.fillRect(362, 551, 19, 6);  //flaring out to calf
	 ctx.fillRect(360, 545, 22, 6);  //flaring out to calf
	 ctx.fillRect(358, 539, 25, 6);  //flaring out to calf
	 ctx.fillRect(356, 533, 28, 6);  //flaring out to calf
	 ctx.fillRect(355, 527, 27, 6);  //flaring out to calf
	 ctx.fillRect(354, 521, 26, 6);  //flaring out to calf
	 ctx.fillRect(353, 515, 25, 6);  //flaring out to calf
	 ctx.fillRect(352, 509, 24, 6);  //flaring out to calf
	 ctx.fillRect(352, 507, 24, 2);
	 
	 //the next part is the skirt. It'll be darker color, flare out, then taper in to waist
	 ctx.fillStyle = 'rgba(110, 100, 35, 1.0)';
	 ctx.fillRect(333, 514, 16, 1);
	 ctx.fillRect(329, 513, 24, 1);
	 ctx.fillRect(325, 512, 32, 1);
	 ctx.fillRect(321, 511, 40, 1);
	 ctx.fillRect(317, 510, 48, 1);
	 ctx.fillRect(313, 509, 56, 1);
	 ctx.fillRect(309, 508, 64, 1);
	 ctx.fillRect(305, 506, 72, 2);
	 ctx.fillRect(301, 505, 76, 3);
	 ctx.fillRect(299, 503, 80, 2);
	 ctx.fillRect(297, 501, 84, 2);
	 ctx.fillRect(295, 499, 86, 2);
	 ctx.fillRect(293, 497, 90, 2);
	 ctx.fillRect(291, 495, 94, 2);
	 ctx.fillRect(293, 493, 90, 2);
	 ctx.fillRect(295, 491, 86, 2);
	 ctx.fillRect(297, 489, 82, 2);
	 ctx.fillRect(299, 487, 78, 2);
	 ctx.fillRect(301, 485, 74, 2);
	 ctx.fillRect(303, 483, 70, 2);
	 ctx.fillRect(305, 481, 66, 2);
	 ctx.fillRect(307, 479, 62, 2);
	 ctx.fillRect(309, 477, 58, 2);
	 ctx.fillRect(311, 475, 54, 2);
	 ctx.fillRect(313, 473, 50, 2);
	 
	 //the next part is the belt around the waist.
	 ctx.fillStyle = 'rgba(101, 67, 33, 1.0)';
	 ctx.fillRect(312, 471, 52, 2);
	 ctx.fillRect(311, 469, 54, 2);
	 ctx.fillRect(310, 467, 56, 2);
	 ctx.fillRect(309, 465, 58, 2);
	 ctx.fillRect(309, 463, 58, 2);
	 ctx.fillRect(309, 461, 58, 2);
	 ctx.fillRect(309, 459, 58, 2);
	 ctx.fillRect(310, 458, 56, 1);
	 ctx.fillRect(311, 457, 54, 1);
	 ctx.fillRect(312, 456, 52, 1);
	 
	 
	//clear <canvas>
	//gl.clear(gl.COLOR_BUFFER_BIT);
	
	//Eloy Beginning here for construction
	 //2. Get the rendering context for 2DCG
  var gab = canvas.getContext('2d');
  




 


//Begin the hat :D
//note you only need one functon when traced polygons...
  gab.beginPath();
    gab.fillStyle = 'rgba(101, 120, 33, 1.0)';

  var Vshift = 272; //just to Vshift if I feel like it 
  var Hshift = 262.5;

 gab.moveTo(43+Hshift, 50+Vshift);
  gab.lineTo(107+Hshift, 50+Vshift);
  gab.lineTo(75+Hshift,Vshift+1);
  gab.fill();

  gab.fillRect(75+Hshift,1 + Vshift,15,30);
  gab.fillRect(80+Hshift, Vshift - 9,10,20);
  gab.fillRect(87+Hshift,Vshift - 15,10,30);
  gab.fillRect(97+Hshift,Vshift - 17,10,10);

 

 //gloves
  //triangle base 
  gab.fillStyle = 'rgba(101, 67, 33, 1.0)';
  
  gab.fill();

//gloves base
	  gab.fillRect(-2+Hshift, 237+Vshift,6,19); //left
	  gab.fillRect(-2+Hshift, 227+Vshift,15,15);//left
	  gab.fillRect(9+Hshift, 237+Vshift,3,14);//left

	  gab.fillRect(144+Hshift, 237+Vshift,6,19); //left
	  gab.fillRect(135+Hshift, 227+Vshift,15,15);//left
	  gab.fillRect(136+Hshift, 237+Vshift,3,14);//left

  //Drawing the head
  gab.fillRect(60+Hshift, 50+Vshift, 30, 30);  //fill left foot.

  



  //Decorative headpiece 
  gab.fillStyle = 'rgba(110, 100, 35, 1.0)';//set a dark brown color
  gab.fillRect(55+Hshift, 75+Vshift, 40, 10);  //fill left foot.
  gab.fillRect(40+Hshift, 85+Vshift, 70, 10);  //fill left foot.
gab.fillRect(72+Hshift,1 + Vshift,15,30);
  gab.fillRect(77+Hshift, Vshift - 9,10,20);
  gab.fillRect(84+Hshift,Vshift - 15,10,30);
  gab.fillRect(94+Hshift,Vshift - 17,10,10);

//his basey triangle part
  gab.fillStyle ='rgba(110, 100, 35, 1.0)';
  gab.moveTo(15+Hshift,95+Vshift);
  gab.lineTo(135+Hshift,95+Vshift);
  gab.lineTo(75+Hshift,200+Vshift);
  gab.fill();

//base rectangle torso part
  gab.fillRect(50+Hshift,115+Vshift,50,70);

//arms 
  gab.fillRect(23+Hshift, 97 +Vshift,11,19); //left
  gab.fillRect(20+Hshift, 116+Vshift,11,19); //left
  gab.fillRect(17+Hshift, 135+Vshift,11,19); //left
  gab.fillRect(14+Hshift, 152+Vshift,11,19); //left
  gab.fillRect(11+Hshift, 169+Vshift,11,19); //left
  gab.fillRect(8 +Hshift, 186+Vshift,11,19); //left
  gab.fillRect(5 +Hshift, 203+Vshift,11,19); //left

  gab.fillRect(116+Hshift, 97 + Vshift, 11, 19); //right
  gab.fillRect(119+Hshift, 116+ Vshift, 11, 19); //right
  gab.fillRect(122+Hshift, 135+Vshift,11,19); //right
  gab.fillRect(125+Hshift, 152+Vshift,11,19); //right
  gab.fillRect(128+Hshift, 169+Vshift,11,19); //right
  gab.fillRect(131+Hshift, 186+Vshift,11,19); //right
  gab.fillRect(134+Hshift, 203+Vshift,11,19); //right


//arm fill
  
  gab.fillRect(16+Hshift, 97 +Vshift,11,19); //left
  gab.fillRect(13+Hshift, 116+Vshift,11,19); //left
  gab.fillRect(10+Hshift, 135+Vshift,11,19); //left
  gab.fillRect(9+Hshift, 152+Vshift,11,19); //left
  gab.fillRect(4+Hshift, 169+Vshift,11,19); //left
  gab.fillRect(1 +Hshift, 186+Vshift,11,19); //left
  gab.fillRect(Hshift-2, 203+Vshift,11,19); //left


  gab.fillRect(123+Hshift, 97 + Vshift, 11, 19); //right
  gab.fillRect(126+Hshift, 116+ Vshift, 11, 19); //right
  gab.fillRect(129+Hshift, 135+Vshift,11,19); //right
  gab.fillRect(132+Hshift, 152+Vshift,11,19); //right
  gab.fillRect(135+Hshift, 169+Vshift,11,19); //right
  gab.fillRect(138+Hshift, 186+Vshift,11,19); //right
  gab.fillRect(141+Hshift, 203+Vshift,11,19); //right
gab.closePath();
gab.beginPath();
//top of gloves
gab.fillStyle = 'rgba(101, 67, 33, 1.0)';


gab.moveTo(Hshift-10,  222+Vshift);//left
  gab.lineTo(22+Hshift, 222+Vshift);//left
  gab.lineTo(8+Hshift, 232+Vshift);//left

  gab.moveTo(127+Hshift,  222+Vshift);//left
  gab.lineTo(159+Hshift, 222+Vshift);//left
  gab.lineTo(145+Hshift, 232+Vshift);//left
gab.fill();

gab.closePath();
//Little Nosy arent we ;)
gab.beginPath();
gab.fillStyle = 'rgba(255, 0, 0, 1.0)';

  gab.moveTo(60+Hshift, 50+Vshift);
  gab.lineTo(70+Hshift, 50+Vshift);
  gab.lineTo(65+Hshift,55+Vshift);

  gab.moveTo(80+Hshift, 50+Vshift);
  gab.lineTo(90+Hshift, 50+Vshift);
  gab.lineTo(85+Hshift,55+Vshift);
  gab.fill(); 
gab.closePath();

	gab.fillStyle = 'rgba(0, 0, 0, 1.0)';

  gab.fillRect(72+Hshift, 57+Vshift,8,4); //right
  gab.beginPath();
  gab.moveTo(65+Hshift, 65+Vshift);
  gab.lineTo(85+Hshift, 65+Vshift);
  gab.stroke();




}