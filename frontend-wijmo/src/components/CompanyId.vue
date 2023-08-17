<template>
    <div>
        <BasePicker v-if="Editable" searchApiPath="companies/search/findByCompanyQuery" searchParameterName="name" idField="code" nameField="name" path="companies" label="CompanyId" v-model="value" @selected="pick" :editMode="editMode" />
        <div v-else style="height:100%" @click="EditableClick">
            <span>{{ value && value.name ? value.name : '' }}</span>
        </div>
    </div>

</template>

<script>
import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'CompanyId',
    mixins:[BaseEntity],
    components:{
    },
    data: () => ({
        path: 'companies',
    }),
    props: {
        Editable: Boolean,
    },
    watch: {
        value(val){
            this.value = val;
            this.change();
            this.Editable = false
        },
    },
    async created(){
        if (this.value && this.value.id !== undefined) {
            this.value = await this.repository.findById(this.value.id)
        }
    },
    methods: {
        pick(val){
            this.value = val;
            this.change();
        },
        EditableClick(){
            if(this.editMode == true) {
                this.Editable = true
            }
        }
    }
}
</script>

