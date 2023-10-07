
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MenuMenuGroupManager from "./components/listers/MenuMenuGroupCards"
import MenuMenuGroupDetail from "./components/listers/MenuMenuGroupDetail"
import MenuMenuManager from "./components/listers/MenuMenuCards"
import MenuMenuDetail from "./components/listers/MenuMenuDetail"

import BasicProductManager from "./components/listers/BasicProductCards"
import BasicProductDetail from "./components/listers/BasicProductDetail"

import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/menus/menuGroups',
                name: 'MenuMenuGroupManager',
                component: MenuMenuGroupManager
            },
            {
                path: '/menus/menuGroups/:id',
                name: 'MenuMenuGroupDetail',
                component: MenuMenuGroupDetail
            },
            {
                path: '/menus/menus',
                name: 'MenuMenuManager',
                component: MenuMenuManager
            },
            {
                path: '/menus/menus/:id',
                name: 'MenuMenuDetail',
                component: MenuMenuDetail
            },

            {
                path: '/basics/products',
                name: 'BasicProductManager',
                component: BasicProductManager
            },
            {
                path: '/basics/products/:id',
                name: 'BasicProductDetail',
                component: BasicProductDetail
            },

            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },



    ]
})
