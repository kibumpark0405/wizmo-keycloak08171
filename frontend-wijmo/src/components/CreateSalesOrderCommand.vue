<template>

    <v-card outlined>
        <v-card-title>
            CreateSalesOrder
        </v-card-title>

        <v-card-text>
            <String label="SalesOrderNumber" v-model="value.salesOrderNumber" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createSalesOrder"
            >
                CreateSalesOrder
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateSalesOrderCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.salesOrderNumber = '';
        },
        watch: {
        },
        methods: {
            createSalesOrder() {
                this.$emit('createSalesOrder', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

