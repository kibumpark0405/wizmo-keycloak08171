<template>
    <div>
        <String label="수주 번호" v-model="value.salesOrderNumber" :editMode="editMode"/>
        <String label="수주 담당자" v-model="value.salesPerson" :editMode="editMode"/>
        <SalesType offline label="수주유형" v-model="value.salesType" :editMode="editMode" @change="change"/>
        <CompanyId offline label="CompanyId" v-model="value.companyId" :editMode="editMode" @change="change"/>
        <!-- <SalesItem offline label="SalesItem" v-model="value.salesItem" :editMode="editMode" @change="change"/> -->
        <SalesItemsDetailGrid label="SalesItem" offline v-model="value.salesItem" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'SalesOrder',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "salesOrders"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

