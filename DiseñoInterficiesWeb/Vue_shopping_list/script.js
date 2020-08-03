var app = new Vue({
    el: '#app',
    data: {
        title: 'Shopping List',
        name: '',
        price: '',
        items: []
    },
    computed: {
        totalAmount () {
            let sumaTotal = 0;
            this.items.forEach(item => {
                sumaTotal += item.quantity * item.price;
            });
            return sumaTotal;
        }
    },
    methods: {
        changeTitle: function(event) {
            this.title = event.target.value;
        },
        addItem: function() {
            if (this.name && this.price) {
                let item = {
                    name: this.name,
                    quantity: 1,
                    price: this.price
                };
                this.items.push(item);
            }
            
            this.updateTotalAmount();
        },
        deleteItem: function (index){
            this.items.splice(index, 1); //delete 1 element from the array at the position index
        },
        updateItem(index, quantity) {
            this.items[index].quantity = quantity;
            this.updateTotalAmount;
        },
        updateTotalAmount() {
            this.totalAmount;
        }
    }
})