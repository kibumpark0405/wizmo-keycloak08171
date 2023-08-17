<template>

    <v-card outlined>
        <v-card-title>
            UpdateSalesOrder
        </v-card-title>

        <v-card-text>
            <String label="SalesOrderNumber" v-model="value.salesOrderNumber" :editMode="editMode"/>
            <String label="SalesPerson" v-model="value.salesPerson" :editMode="editMode"/>
            <CompanyId offline label="CompanyId" v-model="value.companyId" :editMode="editMode" @change="change"/>
            <SalesItemList offline label="SalesItems" v-model="value.salesItems" :editMode="editMode" @change="change"/>
            <SalesType offline label="SalesType" v-model="value.salesType" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateSalesOrder"
            >
                UpdateSalesOrder
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
        name: 'UpdateSalesOrderCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.salesOrderNumber = '';
            this.value.salesPerson = '';
            this.value.companyId = {};
            this.value.salesItems = [];
            this.value.salesType = {};
        },
        watch: {
        },
        methods: {
            updateSalesOrder() {
                this.$emit('updateSalesOrder', this.value);
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

