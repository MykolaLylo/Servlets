const REGISTRATION_ENDPOINT = "register"
function handleRegister(event){
    event.preventDefault();

    const formData = new FormData(event.target);

    const userObject = {};
        formData.forEach((value, key)=>{
        userObject[key] = value;
    });
    console.log(userObject);
    const massageBlock = document.getElementById("massage");

    if(userObject.password !== userObject.confirmation){
        massageBlock.innerText = 'Password should match';
        return;
    }

    const sendData = async (data) =>{
        const response = await fetch(REGISTRATION_ENDPOINT,{
            method: 'POST',
            body: JSON.stringify(data),
            headers:  {
                'Content-Type': 'application/json'
            }
        });
        console.log(response);
        switch(response.status){
        case 200: window.location.href = response.url;
        break;
        case 409: massageBlock.innerText = `User with email ${userObject.email} already exist`;
                  document.getElementById('email').style.outline = '1px solid red';
        break;
      default:
        massageBlock.innerText = 'Oops something went wrong. Please try again';
        }
    }
    sendData(userObject);
}
