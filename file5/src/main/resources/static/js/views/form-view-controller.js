$('#btn-click').on("click", e => {
    e.preventDefault();
    console.log("click event, actual body:", getBody())

    $.ajax({
        type: 'POST',
        url: '/file5/view/form/viewFormInputsByConsole',
        data: getBody(),
        success: function (datA) {
            console.log('datA -->', datA);
        }
    });

});

$('#form-id').bind("submit", e => {
    e.preventDefault();
    console.log("submit event, actual body:", getBody())

    $.ajax({
        type: 'POST',
        url: '/file5/view/form/viewFormInputsByConsole',
        data: getBody(),
        success: function (datA) {
            console.log('datA -->', datA);
        }
    });
})

const getBody = () => {
    return {
        name: $('#name-id').val(),
        age: $('#age-id').val(),
    };
}
