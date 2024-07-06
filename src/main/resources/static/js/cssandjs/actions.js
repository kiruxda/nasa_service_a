function getDate() {
    var date = document.getElementById('date').value.toString();
    window.location.href = '/apod/'+date;
}
document.querySelector('input[type="date"]').max = new Date().toISOString().split('T')[0];