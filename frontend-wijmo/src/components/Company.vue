<template>
    <div>
        <String label="Code" v-model="value.code" :editMode="editMode"/>
        <String label="이름" v-model="value.name" :editMode="editMode"/>
        <String label="산업" v-model="value.industry" :editMode="editMode"/>
        <Date label="설립일자" v-model="value.foundedDate" :editMode="editMode"/>

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
    name: 'Company',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "companies"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

