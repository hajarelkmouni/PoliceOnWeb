<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
<style>
#chartContainer {
    width: 70%;
    height: 500px;
    margin: 0 auto;
    margin-top:-370px;
}
</style>
</head>
<body>
    <div id="chartContainer"></div>
    <script type="text/javascript">
        var chart = new CanvasJS.Chart("chartContainer", {
        	  backgroundColor: "whitesmoke",
            title:{
                text: "Nombre de crimes par r�gion pendant l'an "
            },
            axisX: {
                title: "R�gions",
                interval: 1,
                gridThickness: 0
            },
            axisY: {
                title: "Nombre de crimes",
                gridThickness: 0
            },
            data: [
                {
                    type: "column",
                    dataPoints: [
                        { label: "Tanger-T�touan-Al Hoceima", y: ${NumChartsTTAH} },
                        { label: "Rabat-Sal�-K�nitra", y: ${NumChartsRSK}  },
                        { label: "L'Oriental", y: ${NumChartsOR} }  ,
                        { label: "F�s-Mekn�s", y: ${NumChartsFM} }  ,
                        { label: "Beni Mellal-Kh�nifra", y: ${NumChartsBMK} }  ,
                        { label: "Casablanca-Settat", y: ${NumChartsCS} }  ,
                        { label: "Marrakech-Safi", y: ${NumChartsMRS} }  ,
                        { label: "Dr�a-Tafilalet", y: ${NumChartsDT} }  ,
                        { label: "Souss-Massa", y: ${NumChartsSM} }  ,
                        { label: "Guelmim-Oued Noun", y: ${NumChartsGON} },
                        { label: "La�youne-Sakia El Hamra", y: ${NumChartsLSH} }  ,
                        { label: "Dakhla-Oued Ed Dahab", y: ${NumChartsSM} }  
                    ]
                }
            ]
        });
        chart.render();

</script>
<script type="text/javascript">
function toggleSidebar() {
	  var sidebar = document.getElementById("sidebar");
	  var main = document.getElementById("main");
	  var tableusers = document.getElementById("tableUsers");
	  var currentWidth = sidebar.style.width;
	  
	  if (currentWidth === "0px" || currentWidth === "") {
	    openSidebar();
	  } else {
	    closeSidebar();
	  }
	}
function openSidebar() {
document.getElementById("sidebar").style.width = "269px";/*269px*/
document.getElementById("main").style.marginLeft = "250px";
document.getElementById("idfaq").style.marginLeft = "250px";
document.getElementById("tableUsers").style.marginLeft = "269px";
document.getElementById("chartContainer").style.marginLeft = "269px";
document.body.style.backgroundColor = "whitesmoke";/*#e6e8ed*/


}

function closeSidebar() {
document.getElementById("sidebar").style.width = "0";
document.getElementById("main").style.marginLeft= "0";
document.getElementById("idfaq").style.marginLeft = "0";
document.getElementById("tableUsers").style.marginLeft = "90px";
document.getElementById("chartContainer").style.marginLeft = "0";
document.body.style.backgroundColor = "white";
}

</script>

</head>
<body>
<div id="chartContainer" style="height: auto; width: auto;"></div>
</body>
</html>