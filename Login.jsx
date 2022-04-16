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
    url("https://img.freepik.com/free-photo/black-friday-elements-assortment_23-2149074076.jpg?w=2000")
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

const Form = styled.form`
  display: flex;
  flex-direction: column;
`;

const Input = styled.input`
  flex: 1;
  min-width: 40%;
  margin: 10px 0;
  padding: 10px;
`;

const Button = styled.button`
  width: 40%;
  border: none;
  padding: 15px 20px;
  background-color: teal;
  color: white;
  cursor: pointer;
  margin-bottom: 10px;
`;




function Login () {
    
   
  const queryParams = new URLSearchParams(window.location.search);
  const pid = queryParams.get('prod_id');
            
		return (
     
      <Container>

      <Wrapper>
        
        <center>
        <Title>SIGN IN</Title>
			<div>
				<form  action="http://localhost:3000/productpage">
        <br/>	<br/>
						Useremail:<input type="text"  />
            <br/>				<br/>
					Password:	<input type="password" name="prod_id"	value={pid}/>
					<br/>	<br/>
					<button type="submit" >Login</button>	<br/>	<br/>
				</form>
			</div>
      </center>
      </Wrapper>
    </Container>
		)
	}




export default Login;
