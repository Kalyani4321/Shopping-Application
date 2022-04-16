import React, { useState, useEffect } from 'react'
//import { toast } from 'react-toastify'
import styled from "styled-components";
import { mobile } from "../responsive";
import { Link } from "react-router-dom";
import {useNavigate} from 'react-router-dom';
import { Container } from '@material-ui/core';

const Button = styled.button`
    border:none;
    padding: 10px;
    background-color: white;
    color:gray;
    cursor: pointer;
    font-weight: 600;
    
`;

function CategoryList(){

    const [category, setCategory] = useState([]);
    useEffect(() => {
        const getAllCategory = async () => {
            const res = await fetch('http://localhost:8080/getAllCategory');
            const getdata = await res.json();
            setCategory(getdata);
            console.log(getdata);
        }
        getAllCategory();

    },[]);
    
    return (
        <Container>
        <div className="row">
            <div className="col-sm-8 text-success">
            <h2 className="p-3 fw-bold text-white" style={{ marginTop:'10px',border:'solid', marginBottom:'10px', borderRadius:'20px',textAlign:"center"}}>Category Details</h2>
            
                    {
                        category.map( (getAllCategory) => (
                           
                          
                        <center> <div>
                           <img src={getAllCategory.cat_image} width={600} height={300} ></img>
                           <br/>
                           <h1>{getAllCategory.category_name}</h1>
                           <br/>
                           <button><h3><Link to={"/productsByCategory?cat_id="+getAllCategory.cat_id}>SHOP NOW</Link></h3></button>
                           <br/>
                           <br/>
                           </div>
                           </center>
                        )
                        )
                       
                    }
                
            </div>
        </div>
        </Container>
    )
}


export default CategoryList;
