import React from "react";
import Announcement from "../components/Announcement";
import Categories from "../components/Categories";
import Footer from "../components/Footer";
import Navbar from "../components/Navbar";
import Newsletter from "../components/Newsletter";
import Products from "../components/Products";
import Slider from "../components/Slider";
import CategoryList from "../components/CategoryList";
import ProductsList from "../components/ProductList";
import { Container } from "@material-ui/core";
const Home = () => {
  return (
    <div>
      <Announcement />
      <Navbar />
      <Container>
      <center>
      <div height={500}>
          <br/><br/><br/>
      <h1>Your Order has been placed successfully!</h1><br/><br/>
      <h2><a href="http://localhost:3000/">Return To Home Page</a></h2>
      <br/><br/><br/>
      </div></center></Container>
      <Footer/>
    </div>
  );
};

export default Home;
