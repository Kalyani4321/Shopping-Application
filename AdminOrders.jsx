import React, { useState, useEffect } from 'react'
import styled from "styled-components";
import Announcement from "../components/Announcement";
import Footer from "../components/Footer";
import Navbar from "../components/Navbar";
import { mobile } from "../responsive";
import { Container } from '@material-ui/core';
import { Link } from "react-router-dom";


const OrderList = () => {
  const queryParams = new URLSearchParams(window.location.search);
  const [orders, setOrders] = useState([]);
  useEffect(()=>{
 const getorder = async ()=>{
   
     const res=  await fetch(`http://localhost:8080/shipper/getorders`);
     const getdata = await res.json();
     setOrders(getdata);
     console.log(getdata);
   }
   
  
  getorder()
 },[])

  
  return (
    
    <Container>
      <Navbar />
      <Announcement />
      <table border={1} className="table table-bordered text-black" style={{marginTop:'10px',border:'solid', marginBottom:'10px', textAlign:"center"}}>
                <thead>
                    <tr>
                        <th>order number</th>
                        <th>customer email</th>
                        <th>customer contact</th>
                        <th>customer address</th>
                        <th>amount</th>
                        <th>order date</th>
                        <th>delivery date</th>
                        <th>Product name</th>
                        <th>Product image</th>
                        <th>shipper contact</th>
                        <th>status</th>
                    </tr>
                </thead>
                <tbody style={{marginTop:'10px',border:'solid', marginBottom:'10px', borderRadius:'100px',textAlign:"center"}}>
                    {
                        orders.map( (getorder) => (
                        <tr >
                            <td>{getorder.oid}</td>
                           <td>{getorder.customer.email}</td>
                           <td>{getorder.customer.contact}</td>
                           <td>{getorder.customer.address}</td>
                           <td>{getorder.amount}</td>
                           <td>{getorder.orderdate}</td>
                           <td>{getorder.deliverydate}</td>
                           <td>{getorder.product.prod_name}</td>
                           <td><img width={200} height={100} src={getorder.product.prod_image}/></td>
                           <td>{getorder.shipper.contact}</td>
                           <td><form><input type="text" placeholder={getorder.status} name="status" /><br/><br/><input type="submit" value="change status"></input></form></td>
                        </tr>
                        
                        )
                        )
                    }
                </tbody>
            </table>
       
        
      
      <Footer />
    </Container>
    
  );
};

export default OrderList;
