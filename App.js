import logo from './logo.svg';
import './App.css';
import Home from './pages/Home';
import Products from './pages/Products';
import Productpage from './pages/Productpage';
import AdminLogin from './adminpages/AdminLogin';
import AdminHome from './adminpages/AdminHome';
import AdminOrders from './adminpages/AdminOrders';
import AddProduct from './adminpages/AddProduct';

import {
  BrowserRouter,
  Routes,
  Route,
  Link,
} from "react-router-dom";

import About from "./pages/Login";
import ContactUs from "./pages/Register";
import Register from './pages/Register';
import Login from './pages/Login';
import ProductList from './pages/ProductList';
import Cart from './pages/Cart';
import Product from './pages/Product';
import ProductsByCategory from './pages/ProductsByCategory';
import Orders from './pages/Orders';
import OrderSuccess from './pages/OrderSuccess';
import Paymentpage from './pages/Paymentpage';
import OrderList from './pages/OrderList';

  
  function App() {
    const user=true;

    return (
     
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home/>} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/products" element={<Products />} />
          <Route path="/productsByCategory" element={<ProductsByCategory />} />
          <Route path="/cart" element={<Cart />} />
          <Route path="/product" element={<Product />} />
          <Route path="/productpage" element={<Productpage />} />
          <Route path="/paymentpage" element={<Paymentpage />} />
          <Route path="/ordersuccess" element={<OrderSuccess />} />
          <Route path="/orders" element={<Orders />} />
          <Route path="shipper/getorders" element={<OrderList />} />
          <Route path="/admin" element={<AdminLogin />} />
          <Route path="/admin/home" element={<AdminHome />} />
          <Route path="/admin/orders" element={<AdminOrders />} />
          <Route path="/admin/addproduct" element={<AddProduct />} />

        </Routes>
      </BrowserRouter>
    );
  }
  


export default App;
