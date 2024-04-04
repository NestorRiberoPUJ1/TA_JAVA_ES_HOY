


/* EVENTO DE CLICK PARA DESAPARECER */
$(".box").click(function () {
    $(this).hide();
    $("#botoncitoReset").text("Restaurar");
    $("#botoncitoReset").attr("disabled", false);
})

/* AL HACER CLICK TODAS LAS BOX VUELVEN A APARECER */
/* SELECTOR . atributo o evento (contenido o vacio) si evento va la funcion */
$("#botoncitoReset").click(function () {
    $(".box").show();
    $(this).text("Restaurado");
    $(this).attr("disabled", true);
})



/* CUANDO EL MOUSE PASE POR LA CAJA */
$(".box").hover(
    function () {
        console.log("ENTRÓ");
        $(this).css("border-width", "4px");
        $(this).css("background-color", "lightgrey");
        $(this).addClass("roundBox");
        $(this).children().animate({
            opacity: 0.25,
            height: "150%",
            width: "150%",
        }, 1000, function () {
            console.log("ANIMATION COMPLETED");
        })
    },
    function () {
        console.log("SALIÓ");
        $(this).css("border-width", "2px");
        $(this).css("background-color", "white");
        $(this).removeClass("roundBox");
        $(this).children().animate({
            opacity: 1,
            height: "100%",
            width: "100%",
        }, 1000, function () {
            console.log("ANIMATION COMPLETED");
        })
    }
)