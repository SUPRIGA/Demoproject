<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style type="text/css">
body,html {
  font-family: 'Open Sans', 'sans-serif';
   height: 100%;
    background-repeat: no-repeat;
    background-image: linear-gradient(rgb(100,149,237), rgb(65,105,225));
}

</style>
<style type="text/css">
    ul{
        padding: 0;
        list-style: none;
        background:	#191970;
    }
    ul li{
        display: inline-block;
        position: relative;
        line-height: 40px;
        text-align: left;
    }
    ul li a{
        display: block;
        padding: 6px 25px;
         color: #F0FFFF;
        text-decoration: none;
    }
    ul li a:hover{
        color: #0000FF;
        background :#F0FFFF ;
    }
    ul li ul.dropdown{
        min-width: 100%; /* Set width of the dropdown */
        background:#6A5ACD;
        display: none;
        position: absolute;
        z-index: 999;
        left: 0;
    }
    ul li:hover ul.dropdown{
        display: block;
        	/* Display the dropdown */
    }
    ul li ul.dropdown li{
        display: block;
    }
</style>
<body>

<div class="container">

  <div><img src="<c:url value="/resources/LOGO1.jpg"/>" height=150px width=350px></div>

<div class="text-right">
   <button type="button" class="btn btn-info">Register</button>
   <button type="button" class="btn btn-info">Login</button>
      <a href="#" class="btn btn-info btn-md">
      <span class="glyphicon glyphicon-shopping-cart">Cart</span>
        </a>
     
</div>
</div>

    <ul>
        <li><a href="#">Home e Shop</a></li>
         <li>
            <a href="#">Kitchen and Home Appliances &#9662;</a>
            <ul class="dropdown">
            <li><a href="#">Mixer Grinders</a></li>
            <li><a href="#">Irons</a></li>
            <li><a href="#">Ceiling Fans</a></li>
            <li><a href="#">Water Purifiers</a></li>
            <li><a href="#">Induction Cooktops</a></li>
            </ul>
        </li>
    <li>
            <a href="#">Large Appliances &#9662;</a>
            <ul class="dropdown">
                <li><a href="#">Air Conditioners</a></li>
                <li><a href="#">Air Coolers</a></li>
                <li><a href="#">Refrigerator</a></li>
                <li><a href="#">Washing Machine</a></li>
                <li><a href="#">Microwave Ovens</a></li>
            </ul>
        </li>
        
        <li>
            <a href="#">Home Furniture &#9662;</a>
            <ul class="dropdown">
                <li><a href="#">Dining Table</a></li>
                <li><a href="#">Laptop Table</a></li>
                <li><a href="#">Shoe Rack</a></li>
                <li><a href="#">Office Table</a></li>
                <li><a href="#">T.V Units</a></li>
                <li><a href="#">Sofas</a></li>
                <li><a href="#">Study Table</a></li>
            </ul>
        </li>
        <li>
            <a href="#">Kitchen and Dining &#9662;</a>
            <ul class="dropdown">
                <li><a href="#">Bottle and Container</a></li>
                <li><a href="#">Pot and Pans</a></li>
                <li><a href="#">Pressure Cookers</a></li>
                <li><a href="#">Gas Stoves</a></li>
                <li><a href="#">Dinner Sets</a></li>
                <li><a href="#">Kitchen Tools</a></li>
                <li><a href="#">Cocktail Glasses</a></li>
            </ul>
        </li>
        <li>
            <a href="#">HomeDecor and Lighting &#9662;</a>
            <ul class="dropdown">
                <li><a href="#"></a></li>
                <li><a href="#">LED Bulbs</a></li>
                <li><a href="#">Mirrors</a></li>
                <li><a href="#">Decoration Lights</a></li>
                <li><a href="#">Artwork</a></li>
                <li><a href="#">PhotoFrames</a></li>
                <li><a href="#">Table Lamps</a></li>
            </ul>
        </li>
         <li>
            <a href="#">Home Improvement and Garden &#9662;</a>
            <ul class="dropdown">
                <li><a href="#">Pest Controls</a></li>
                <li><a href="#">Gardening Tools</a></li>
                <li><a href="#">Barbecue OutdoorDining</a></li>
                <li><a href="#">Home Storage</a></li>
                <li><a href="#">Cleaning Tools</a></li>
            </ul>
        </li>
        
    </ul>
   
<style type="text/css">

.carousel{
    background: #2f4357;
    margin-top: 20px;
}
.carousel .item img{
    margin: 0 auto; /* Align slide image horizontally center */
}
.bs-example{
	margin: 20px;
}
</style>
<body>
<div class="bs-example">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Carousel indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
            <li data-target="#myCarousel" data-slide-to="3"></li>
            <li data-target="#myCarousel" data-slide-to="4"></li>
             <li data-target="#myCarousel" data-slide-to="5"></li>
              <li data-target="#myCarousel" data-slide-to="6"></li>
               <li data-target="#myCarousel" data-slide-to="7"></li>
                <li data-target="#myCarousel" data-slide-to="8"></li>
        </ol> 
          
        <!-- Wrapper for carousel items -->
        <div class="carousel-inner">
            <div class="item active">
                <div><img src="<c:url value="/resources/save.2.jpg"/>"height=350px width=100%></div>
            </div>
            <div class="item">
             <div><img src="<c:url value="/resources/IMAGE.jpg"/>"height=350px width=100%></div>
       
        </div>
        <div class="item">
             <div><img src="<c:url value="/resources/6.jpg"/>"height=350px width=100%></div>
             </div>
        
        
         <div class="item">
             <div><img src="<c:url value="/resources/mg.jpg"/>"height=350px width=100%></div>
             </div>
              <div class="item">
             <div><img src="<c:url value="/resources/kit1.jpg"/>"height=350px width=100%></div>
             </div>
              <div class="item">
             <div><img src="<c:url value="/resources/vivek.jpg"/>"height=350px width=100%></div>
             </div>
              <div class="item">
             <div><img src="<c:url value="/resources/vivek2.jpg"/>"height=350px width=100%></div>
             </div>
              <div class="item">
             <div><img src="<c:url value="/resources/viv.jpg"/>"height=350px width=100%></div>
             </div>
        </div>
        <!-- Carousel controls -->
       <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>


    
    </body>
    </html>