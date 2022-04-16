import React, { useState, useEffect } from 'react'
import styled from "styled-components";
import Announcement from "../components/Announcement";
import Footer from "../components/Footer";
import Navbar from "../components/Navbar";
import { mobile } from "../responsive";
import { Container } from '@material-ui/core';
import { Link } from "react-router-dom";
import axios from 'axios';


const Product = () => {
  const queryParams = new URLSearchParams(window.location.search);
const prod_id = queryParams.get('prod_id');
  const [product, setProduct] = useState({});
  useEffect(()=>{
 const getProduct = async ()=>{
   
     const res=  await fetch(`http://localhost:8080/product?prod_id=${prod_id}`);
     const getdata = await res.json();
     setProduct(getdata);
     console.log(getdata);
   }
   
  
  getProduct()
 },{prod_id})

 var prod_data = {
      "amount":product.price,
    "prod_id": product.prod_id, 
    "cust_id": 1,
    "quantity": 1
    
  }

  function handleClick() {
    
    
axios.post(`http://localhost:8080/order`,prod_data,).then((response)=>{
console.log(response);
});

    
  }

  
  return (
    <>
    <Container>
      <Navbar />
      <Announcement />
      
      {
      
      <div>
        <br/>
      <center>
       <img height={400}src={product.prod_image}></img>
    <br/>
        <h1>{product.prod_name}</h1>
        <br/>
         <h3>{product.prod_desc}</h3>
         <br/>
          <h2>Rs.{product.price}</h2>
          <br/>
            <button onClick={handleClick} ><h1><a href="http://localhost:3000/paymentpage">Confirm Order</a></h1></button>
            <br/><br/>
          </center>
        </div>
        }
 
      <Footer />
    </Container>
    </>
  );
};


  
   
  export default Product;
