import axios from 'axios';
import React from "react";
import { View, Text } from 'react-native';
import { useEffect, useState } from "react";
import { response } from 'express';
import { getMenu } from '../services/api';

export default function MenuScreen() {
    const [menuItems, setMenuItems] = useState([]);

    useEffect(() => {
        getMenu().then(response => setMenuItems(response.data));
    }, []);

    return (
        <View>
            {menuItems.map(item => (
                <Text key={item.id}>{item.name} - R{item.price}</Text>
            ))}
        </View>
    );
}