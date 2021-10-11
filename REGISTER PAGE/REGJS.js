function enableButton()
{
    if(document.getElementById("checkBox").checked)
    {
        document.getElementById("submitBtn").disabled=false;
    }
    else
    {
        document.getElementById("submitBtn").disabled=true;
    }
}