const PRODUCT_ENDPOINT ="http://localhost:8080/Servlets_war_exploded/product"
const createCard= (product) => `
<div class="col">
<div class="card shadow-sm"> 
 <img src="${product.image}" alt="product" width="250px" height="250px"> 
 <div class="card-body">
    <p class="card-text" style="font-size: 20px">${product.productName}</p>
    <div class="d-flex justify-content-between align-items-center">
      <div class="btn-group">
        <a href="product?product_id=${product.productId}">
        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
        </a>
        <button type="button" class="btn btn-sm btn-outline-success">
         <i class="fa-sharp fa-solid fa-basket-shopping"></i>
        </button>
      </div>
      <span class="text-muted">${product.price}</span>
    </div>
  </div>
</div>
</div>
`
function saveProduct(event){
    event.preventDefault();
    const formData = new FormData(event.target);
    const productObject = {};

    formData.forEach((value,key)=>{
        productObject[key] = value;
    });

    productObject.image = null;

    const sendData = async (data) => {
        const response = await fetch(PRODUCT_ENDPOINT,{
            method: 'POST',
            body: JSON.stringify(data),
            headers:{
                'Content-Type': 'application/json'
            }
        });

        console.log(response);

        if(response.status !== 200){
            document.getElementById("alert").removeAttribute("hidden");
        }else {
            window.location.href = response.url;
        }
        sendData(productObject);
    }
}

function getAllProducts(){
    fetch(PRODUCT_ENDPOINT,{
        method: 'GET',
        headers: {
            'Content-Type' : 'application/json'
        }
    }).then((response)=>{
        console.log(response);
        return response.json();
    }).then((json)=>{
        console.log(json);
        displayCards(json);
    });
}
function displayCards(products){
    const container = document.getElementById('cards');
    for(const product of products){
        container.innerHTML+= createCard(product)
    }
}
getAllProducts();