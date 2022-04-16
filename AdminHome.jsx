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
import { Link } from "react-router-dom";

const Home = () => {
  return (  
    <div>
      <Announcement />
      <Navbar />  
      <center>
          <div style={{backgroundColor:'Bisque'}}>
      <ul >
          <li><div>
          <br/>
          <img width={600} height={400} src="https://374fmv29e6to2m48r43nyjle-wpengine.netdna-ssl.com/wp-content/uploads/2021/03/image1-1.jpg"/>
                           <h1>Customer Orders  </h1>
                           <br/>
                           <button><h3><Link to={"/admin/orders"}>Customer Orders Details</Link></h3></button>
                           <br/>
                           <br/>
              </div></li>
              <li><div>
          <br/>
          <img width={600} height={400} src="https://inchoo.net/wp-content/uploads/2014/08/merchant-center-magento.png"/>
                           <h1>Add product  </h1>
                           <br/>
                           <button><h3><Link to={"/admin/addproduct"}>Add Product</Link></h3></button>
                           <br/>
                           <br/>
              </div></li>
      </ul>
      </div> </center>
      <Footer/>
    </div>
  );
};

export default Home;
