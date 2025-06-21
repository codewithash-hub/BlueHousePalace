import React, { useEffect, useState } from "react";
import { View, Text, FlatList, StyleSheet, Image, TouchableOpacity } from 'react-native';
import { getMenu } from '../services/api';

export default function MenuScreen() {
    const [menuItems, setMenuItems] = useState([]);

    useEffect(() => {
        getMenu()
        .then(response => setMenuItems(response.data))
        .catch(error => console.error('Error fetching menu:', error));
    }, []);

    const renderItem = ({ item }) => (
        <View style={styles.card}>
            <Image source ={{ uri: 'https://source.unsplash.com/400x300/?burger' }} style = {styles.image} />
            <View style={styles.cardContent}>
                <Text style={styles.title}>{item.name}</Text>
                <Text style={styles.price}>{item.price}</Text>
                <TouchableOpacity style={styles.button}>
                    <Text style={styles.buttonText}>+ Add to Cart</Text>
                </TouchableOpacity>
            </View>
        </View>
    );

    return (
        <View style={styles.container}>
            <Text style={styles.heading}>Our Menu</Text>
            <FlatList data={menuItems} keyExtractor={item => item.id.toString()} renderItem={renderItem} contentContainerStyle={styles.list} />
            {/* {menuItems.map(item => ( 
                <Text key={item.id}>{item.name} - R{item.price}</Text>
            ))} */}
        </View>
    );
}

const styles = StyleSheet.create ({
    container: { flex: 1, backgroundColor: '#fff', paddingHorizontal: 16, paddingTop: 40 },
    heading: { fontSize: 28, fontWeight: 'bold', marginBottom: 16, textAlign: 'center' },
    list: { paddingBottom: 20 },
    card: {
        backgroundColor: '#f8f8f8',
        borderRadius: 16,
        overflow: 'hidden',
        marginBottom: 16,
        shadowColor: '#000',
        shadowOpacity: 0.1,
        shadowRadius: 6,
        elevation: 5,
    },
    image: { width: '100%', height: 180 },
    cardContent: { padding: 12 },
    title: { fontSize: 20, fontWeight: 'bold', marginBottom: 8 },
    price: { fontSize: 16, color: '#444', marginBottom: 12 },
    button: {
        backgroundColor: '#ff6b00',
        paddingVertical: 8,
        borderRadius: 8,
        alignItems: 'center'
    },
    buttonText: { color: '#fff', fontWeight: 'bold' }
});