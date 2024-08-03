$('body').on('click', '#btn-view-by-console', (e) =>{

    e.preventDefault();

    $.ajax({
        type: 'POST',
        url: '/file4/view/list/viewByConsole',
    }).done(function (data) {

        console.log('data', data);

    });

});