function getRepDescription(obj) {
    var id = obj.id.toString();
    var descriptionId = "description"+id;
    console.log(descriptionId);

    var obj = document.getElementById(descriptionId);
    var modal =document.getElementById("modal-content");
    modal.innerText = obj.innerText;
    console.log(modal.innerText);
}


function getProjects(obj) {
    var repName = obj.innerText;
    console.log(repName);
    $("#jsRepositoryName").val(repName);
    $("#hiddenForm").submit();
}