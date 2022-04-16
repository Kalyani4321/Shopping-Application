import React, { useState, useEffect } from 'react'
import styled from "styled-components";
import Announcement from "../components/Announcement";
import Footer from "../components/Footer";
import Navbar from "../components/Navbar";
import { mobile } from "../responsive";
import { Container } from '@material-ui/core';
import { Link } from "react-router-dom";


const Product = () => {
  const queryParams = new URLSearchParams(window.location.search);
const search = queryParams.get('search');
  const [product, setProduct] = useState([]);
  useEffect(()=>{
 const getProduct = async ()=>{
   
     const res=  await fetch(`http://localhost:8080/searchproduct?search=${search}`);
     const getdata = await res.json();
     setProduct(getdata);
     console.log(getdata);
   }
   
  
  getProduct()
 },[])

  
  return (
    <>
    <Container>
      <Navbar />
      <Announcement />
      
      {
       product.map( (getproduct) => (
      <div>
        <br/>
      <center>
       <img height={400}src={getproduct.prod_image}></img>
    <br/>
        <h1>{getproduct.prod_name}</h1>
        <br/>
         <h3>{getproduct.prod_desc}</h3>
         <br/>
          <h2>Rs.{getproduct.price}</h2>
          <br/>
            <button><h1><Link to={`/productpage?prod_id=${getproduct.prod_id}`}>Buy now</Link></h1></button>
            <br/><br/>
          </center>
        </div>
        ))}
        
       
      
      <Footer />
    </Container>
    </>
  );
};

export default Product;
