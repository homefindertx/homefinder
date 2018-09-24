var geocoder;
var listingId = $('.listing-wrapper').data('listing-map-id');
var listingAddress = $('.listing-address').data('listing-map-address');
// console.log(listingAddress);
var maps = document.getElementsByClassName("maps");
// console.log(maps);
var addresses = document.getElementsByClassName("addresses");
// console.log(addresses);
var states = document.getElementsByClassName("states");
// console.log(states);
var cities = document.getElementsByClassName("cities");
// console.log(cities);
var zipcodes = document.getElementsByClassName("zipcodes");
// console.log(zipcodes);

function initMap(current_map) {
    var map = new google.maps.Map(current_map, {
        zoom: 12,
        center: {lat: -34.397, lng: 150.644}
    });
    geocoder = new google.maps.Geocoder();
    codeAddress(geocoder, map);
}

function codeAddress(geocoder, map) {
    // for(var i = 0; i < maps.length; i++) {
        geocoder.geocode({'address': addresses[i].innerHTML + ", " + cities[i].innerHTML + ", " + states[i].innerHTML + " " + zipcodes[i].innerHTML}, function (results, status) {
            if (status === 'OK') {
                // console.log(results[0].geometry.location);
                map.setCenter(results[0].geometry.location);
                var marker = new google.maps.Marker({
                    map: map,
                    position: results[0].geometry.location
                });
            } else {
                // alert('Geocode was not successful for the following reason: ' + status);
            }
        });
    // }
}

for(var i = 0; i < maps.length; i++) {
    initMap(maps[i]);
}
