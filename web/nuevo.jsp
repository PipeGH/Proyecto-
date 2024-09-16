<html lang="en"><head>
	<meta charset="UTF-8">
	<title>Nivo Slider</title>

	<link rel="stylesheet" href="css/nivo-slider.css">
	<link rel="stylesheet" href="css/mi-slider.css">

	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js" type="text/javascript"></script>
	<script src="js/jquery.nivo.slider.js"></script>
        <script src="js/arriba.js"></script>
        
	<script type="text/javascript"> 
		$(window).on('load', function() {
		    $('#slider').nivoSlider(); 
		}); 
	</script>
</head>
<body style="">
         <a class="ir-arriba dropdown-item" href="#">
                       <img src="img/circle-up.png" alt="25" width="25"/> 
        </a>
	<div class="slider-wrapper theme-mi-slider">
            
		<div id="slider" class="nivoSlider">     
		    <img src="img/fondoms.jpg" style="height: 100%" title="#htmlcaption1" />    
		    <img src="img/2.jpg" alt="" title="#htmlcaption2" />    
		    <img src="img/3.jpg" alt="" title="#htmlcaption3" />     
                </div>
                 <div id="htmlcaption1" class="nivo-html-caption">     
		    <h1>Sean Bienvenidos a SETWARE</h1>
		</div>
		<div id="htmlcaption2" class="nivo-html-caption">     
		    <h1>Para mas informacion da click en el boton Acerca de</h1>
		</div>
		<div id="htmlcaption3" class="nivo-html-caption">     
		    <h1>Gracias por visitar</h1>
		</div>
	</div>
</body>
</html>