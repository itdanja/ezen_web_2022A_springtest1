alert("테스트");

$.ajax({
    url: "getdata",
    success: function( re ){
        $("#pbox").html(re);
    }
});