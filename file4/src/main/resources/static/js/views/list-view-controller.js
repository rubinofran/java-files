$('body').on('click', '#btn-generate-pdf', (e) =>{

    e.preventDefault();

    $.ajax({
        type: 'POST',
        url: '/file4/view/list/generatePdf',
    }).done(function (data) {

        console.log('data', data);

    });

});