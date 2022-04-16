import styled from "styled-components";
import {mobile} from "../responsive";
import axios from 'axios';
import React, { Component } from 'react'
import { useNavigate } from "react-router-dom";
const Container = styled.div`
  width: 100vw;
  height: 100vh;
  background: linear-gradient(
      rgba(255, 255, 255, 0.5),
      rgba(255, 255, 255, 0.5)
    ),
    url("https://blog.2checkout.com/wp-content/uploads/2020/07/How-Online-Payment-Gateways-Work-and-How-to-Choose-the-Best-for-Your-Business.png")
      center;
  background-size: cover;
  display: flex;
  align-items: center;
  justify-content: center;
`;

const Wrapper = styled.div`
  width: 25%;
  padding: 20px;
  background-color: white;
  ${mobile({ width: "75%" })}
`;

const Title = styled.h1`
  font-size: 24px;
  font-weight: 300;
`;

function Payment () {
    const queryParams = new URLSearchParams(window.location.search);
  const pid = queryParams.get('prod_id');
//     var prod_data = {
        
//       "prod_id": pid, 
      
      
//     }
  
//     function handleClick() {
      
      
//   axios.post(`http://localhost:8080/productpage?prod_id=`,prod_data,).then((response)=>{
//   console.log(response);
//   });
  
            
		return (
     
      <Container>

      <Wrapper>
        
        <center>
        <Title>Payment Gateaway</Title>
			<div>
				<form  >
        <br/>	<br/>
						Debit/Credit Card number:<input type="text"  />
            <br/>				<br/>
					OTP	:<input type="password" />
					<br/>	<br/>
					<button><a href="http://localhost:3000/ordersuccess">Confirm Payment</a></button>	<br/>	<br/>
				</form>
			</div>
      </center>
      </Wrapper>
    </Container>
		)
	}


//}

export default Payment;
