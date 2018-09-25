// SIDEBAR
var $ = require('JQuery');
$(document).ready(function() {
    var open = false;

    var openSidebar = function() {
        $('.side-collapse').addClass('open-side');
        $('.navbar-toggle-side').addClass('open-side');
        $('#navbar-toggle-side').addClass('open-side');
        open = true;
    };

    var closeSidebar = function() {
        $('.side-collapse').removeClass('open-side');
        $('.navbar-toggle-side').removeClass('open-side');
        $('#navbar-toggle-side').removeClass('open-side');
        open = false;
    };

    $('.navbar-toggle-side, .nav-close').click(function(event) {
        event.stopPropagation();
        var toggle = open ? closeSidebar : openSidebar;
        toggle();
    });

    $(document).click(function(event) {
        if (!$(event.target).closest('.side-collapse').length) {
            closeSidebar();
        }
    });
});

// SEARCHBAR

$(document).ready(function(e){
    $('.search-panel .dropdown-menu').find('a').click(function(e) {
        e.preventDefault();
        var param = $(this).attr("href").replace("#","");
        var concept = $(this).text();
        $('.search-panel span#search_concept').text(concept);
        $('.input-group #search_param').val(param);
    });
});